/*
 * Copyright 2013 Kevin Quan (kevin.quan@gmail.com)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.kevinquan.java.utils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Collection of utilities to work with JSON objects.
 * @author Kevin Quan (kevin.quan@gmail.com)
 *
 */
public class JSONUtils {

    public static final String TAG = JSONUtils.class.getSimpleName();
    
    /**
     * Construct a JSON Object from the string representation of JSON
     * @param jsonAsString The string representation of the JSON
     * @return The JSON object or null if it could not be constructed
     */
    public static JSONObject safeCreateObject(String jsonAsString) {
        if (isEmpty(jsonAsString)) {
            System.err.println("No content was provided.");
            return new JSONObject();
        }
        JSONObject object = null;
        try {
            object = new JSONObject(jsonAsString);
        } catch (JSONException je) {
            System.err.println("Could not construct JSON object from source string: "+jsonAsString);
            je.printStackTrace();
            return new JSONObject();
        }
        return object;
    }
    
    /**
     * Construct a JSON Array from the string representation of JSON
     * @param jsonAsString The string representation of the JSON
     * @return The JSON Array or null if it could not be constructed
     */
    public static JSONArray safeCreateArray(String jsonAsString) {
        if (isEmpty(jsonAsString)) {
            System.err.println("No content was provided.");
            return new JSONArray();
        }
        JSONArray array = null;
        try {
            array = new JSONArray(jsonAsString);
        } catch (JSONException je) {
            System.err.println("Could not construct JSON array from source string: "+jsonAsString);
            je.printStackTrace();
            return new JSONArray();
        }
        return array;
    }
    
    /**
     * Retrieve a JSON Array object stored at the provided key from the provided JSON object
     * @param obj The JSON object to retrieve from
     * @param key The key to retrieve
     * @return the JSON Array object stored in the key, or null if the key doesn't exist
     */
    public static JSONArray safeGetArray(JSONObject obj, String key) {
        if (obj == null || isEmpty(key)) return null;
        if (obj.has(key)) {
            try {
                return obj.getJSONArray(key);
            } catch (JSONException e) {
                System.err.println("Could not get JSONArray from key "+key);
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * Retrieve a JSON array stored at the provided key from the provided JSON object
     * @param obj The JSON object to retrieve from
     * @param key The key to retrieve
     * @return the array stored in the key, or null if the key doesn't exist
     */
    public static JSONArray safeGetArrayFromObject(JSONObject obj, String key) {
        if (obj == null || isEmpty(key)) return null;
        if (obj.has(key)) {
            try {
                return obj.getJSONArray(key);
            } catch (JSONException e) {
                System.err.println("Could not get Array from JSONArray from key "+key);
                e.printStackTrace();
            }
        }
        return null;
    }
    
    /**
     * Retrieve a JSON array stored at the provided key from the provided JSON array
     * @param array The JSON object to retrieve from
     * @param key The key to retrieve
     * @return the array stored in the key, or null if the key doesn't exist
     */
    public static JSONArray safeGetArrayFromArray(JSONArray array, int index) {
        if (array == null || index < 0) return null;
        if (index < array.length() ) {
            try {
                return array.getJSONArray(index);
            } catch (JSONException e) {
                System.err.println("Could not get Array from JSONArray at index "+index);
                e.printStackTrace();
            }
        }
        return null;
    }
    
    /**
     * Retrieve a boolean stored at the provided key from the provided JSON object
     * @param obj The JSON object to retrieve from
     * @param key The key to retrieve
     * @return the boolean stored in the key, or the default value if the key doesn't exist
     */
    public static boolean safeGetBoolean(JSONObject obj, String key, boolean defaultValue) {
        if (obj == null || isEmpty(key)) return defaultValue;
        if (obj.has(key)) {
            try {
                return obj.getBoolean(key);
            } catch (JSONException e) {
                System.err.println("Could not get boolean from key "+key);
                e.printStackTrace();
            }
        }
        return defaultValue;
    }
    
    /**
     * Retrieve a double stored at the provided key from the provided JSON object
     * @param obj The JSON object to retrieve from
     * @param key The key to retrieve
     * @return the double stored in the key, or the default value if the key doesn't exist
     */
    public static double safeGetDouble(JSONObject obj, String key, double defaultValue) {
        if (obj == null || isEmpty(key)) return defaultValue;
        if (obj.has(key)) {
            try {
                return obj.getDouble(key);
            } catch (JSONException e) {
                System.err.println("Could not get double from key "+key);
                e.printStackTrace();
            }
        }
        return defaultValue;
    }
    
    /**
     * Retrieve an integer stored at the provided key from the provided JSON object
     * @param obj The JSON object to retrieve from
     * @param key The key to retrieve
     * @return the integer stored in the key, or the default value if the key doesn't exist
     */
    public static int safeGetInt(JSONObject obj, String key, int defaultValue) {
        if (obj == null || isEmpty(key)) return defaultValue;
        if (obj.has(key)) {
            try {
                return obj.getInt(key);
            } catch (JSONException e) {
                System.err.println("Could not get int from key "+key);
                e.printStackTrace();
            }
        }
        return defaultValue;
    }
    
    /**
     * Retrieve the JSON object stored at the provided key from the provided JSON object
     * @param obj The JSON object to retrieve from
     * @param key The key to retrieve
     * @return the JSON object stored in the key, or null if the key doesn't exist
     */
    public static JSONObject safeGetJSONObject(JSONObject obj, String key) {
        if (obj == null || isEmpty(key)) return null;
        if (obj.has(key)) {
            try {
                return obj.getJSONObject(key);
            } catch (JSONException e) {
                System.err.println("Could not get JSON object from key "+key);
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * Retrieve a JSON object stored at the provided index from the provided JSON Array object
     * @param obj The JSON Array object to retrieve from
     * @param key The index to retrieve
     * @return the JSON object stored at the index, or null if the index doesn't exist
     */
    public static JSONObject safeGetJSONObjectFromArray(JSONArray obj, int index) {
        if (obj == null || index < 0) return null;
        if (obj.length() > index) {
            try {
                return obj.getJSONObject(index);
            } catch (JSONException e) {
                System.err.println("Could not get object from JSONArray from at index "+index);
                e.printStackTrace();
            }
        }
        return null;
    }
    
    /**
     * Retrieve a long stored at the provided key from the provided JSON object
     * @param obj The JSON object to retrieve from
     * @param key The key to retrieve
     * @return the long stored in the key, or the default value if the key doesn't exist
     */
    public static long safeGetLong(JSONObject obj, String key, long defaultValue) {
        if (obj == null || isEmpty(key)) return defaultValue;
        if (obj.has(key)) {
            try {
                return obj.getLong(key);
            } catch (JSONException e) {
                System.err.println("Could not get long from key "+key);
                e.printStackTrace();
            }
        }
        return defaultValue;
    }
    
    /**
     * Retrieve another JSON object stored at the provided key from the provided JSON object
     * @param obj The JSON object to retrieve from
     * @param key The key to retrieve
     * @return the JSON object stored in the key, or null if the key doesn't exist
     */
    public static JSONObject safeGetObject(JSONObject obj, String key) {
        if (obj == null || isEmpty(key)) return null;
        if (obj.has(key)) {
            try {
                return obj.getJSONObject(key);
            } catch (JSONException e) {
                System.err.println("Could not get JSONObject from key "+key);
                e.printStackTrace();
            }
        }
        return null;
    }
    
    /**
     * Retrieve a string stored at the provided key from the provided JSON object
     * @param obj The JSON object to retrieve from
     * @param key The key to retrieve
     * @return the string stored in the key, or null if the key doesn't exist
     */
    public static String safeGetString(JSONObject obj, String key) {
        if (obj == null || isEmpty(key)) return null;
        if (obj.has(key)) {
            try {
                return obj.getString(key);
            } catch (JSONException e) {
                System.err.println("Could not get string from key "+key);
                e.printStackTrace();
            }
        }
        return null;
    }
    
    /**
     * Retrieve a string stored at the provided index from the provided JSON array
     * @param obj The JSON array to retrieve from
     * @param index The index to retrieve the string from
     * @return the string stored at the index, or null if the index doesn't exist
     */
    public static String safeGetStringFromArray(JSONArray obj, int index) {
        if (obj != null && obj.length() > index) {
            try {
                return obj.getString(index);
            } catch (JSONException e) {
                System.err.println("Could not get string from JSONArray from at index "+index);
                e.printStackTrace();
            }
        }
        return null;
    }
    
    /**
     * Retrieve a double stored at the provided index from the provided JSON array
     * @param obj The JSON array to retrieve from
     * @param index The index to retrieve the double from
     * @return the double stored at the index, or the default value if the index doesn't exist
     */
    public static double safeGetDoubleFromArray(JSONArray obj, int index, double defaultValue) {
        if (obj != null && obj.length() > index) {
            try {
                return obj.getDouble(index);
            } catch (JSONException e) {
                System.err.println("Could not get string from JSONArray from at index "+index);
                e.printStackTrace();
            }
        }
        return defaultValue;
    }
    
    
    /**
     * Inserts a JSON Array in the provided JSON object at the specified key.  Will overwrite any existing value for the key.  
     * A null array can be stored.
     * @param obj The JSON object to write to
     * @param key The key to place the value
     * @param value The value to add
     */
    public static void safePutArray(JSONObject obj, String key, JSONArray value) {
        if (obj == null || isEmpty(key)) return;
        try {
            obj.put(key, value);
        } catch (JSONException e) {
            System.err.println("Could not put array with key "+key);
            e.printStackTrace();
        }
    }
    
    /**
     * Inserts a boolean in the provided JSON object at the specified key.  Will overwrite any existing value for the key
     * @param obj The JSON object to write to
     * @param key The key to place the value
     * @param value The value to add
     */
    public static void safePutBoolean(JSONObject obj, String key, boolean value) {
        if (obj == null || isEmpty(key)) return;
        try {
            obj.put(key, value);
        } catch (JSONException e) {
            System.err.println("Could not put boolean with key "+key);
            e.printStackTrace();
        }
    }
    
    /**
     * Inserts a double in the provided JSON object at the specified key.  Will overwrite any existing value for the key
     * @param obj The JSON object to write to
     * @param key The key to place the value
     * @param value The value to add
     */
    public static void safePutDouble(JSONObject obj, String key, double value) {
        if (obj == null || isEmpty(key)) return;
        try {
            obj.put(key, value);
        } catch (JSONException e) {
            System.err.println("Could not put double with key "+key);
            e.printStackTrace();
        }
    }
    
    /**
     * Inserts a float in the provided JSON object at the specified key.  Will overwrite any existing value for the key
     * @param obj The JSON object to write to
     * @param key The key to place the value
     * @param value The value to add
     */
    public static void safePutFloat(JSONObject obj, String key, float value) {
        if (obj == null || isEmpty(key)) return;
        try {
            obj.put(key, value);
        } catch (JSONException e) {
            System.err.println("Could not put float with key "+key);
            e.printStackTrace();
        }
    }
    
    /**
     * Inserts a integer in the provided JSON object at the specified key.  Will overwrite any existing value for the key
     * @param obj The JSON object to write to
     * @param key The key to place the value
     * @param value The value to add
     */
    public static void safePutInt(JSONObject obj, String key, int value) {
        if (obj == null || isEmpty(key)) return;
        try {
            obj.put(key, value);
        } catch (JSONException e) {
            System.err.println("Could not put int with key "+key);
            e.printStackTrace();
        }
    }
    
    /**
     * Inserts a long in the provided JSON object at the specified key.  Will overwrite any existing value for the key
     * @param obj The JSON object to write to
     * @param key The key to place the value
     * @param value The value to add
     */
    public static void safePutLong(JSONObject obj, String key, long value) {
        if (obj == null || isEmpty(key)) return;
        try {
            obj.put(key, value);
        } catch (JSONException e) {
            System.err.println("Could not put long with key "+key);
            e.printStackTrace();
        }
    }

    /**
     * Inserts a JSON object in the provided JSON object at the specified key.  Will overwrite any existing value for the key
     * A null object can be stored.
     * @param obj The JSON object to write to
     * @param key The key to place the value
     * @param value The value to add
     */
    public static void safePutObject(JSONObject obj, String key, JSONObject value) {
        if (obj == null || isEmpty(key)) return;
        try {
            obj.put(key, value);
        } catch (JSONException e) {
            System.err.println("Could not put object with key "+key);
            e.printStackTrace();
        }
    }
    
    /**
     * Inserts a string in the provided JSON object at the specified key.  Will overwrite any existing value for the key
     * @param obj The JSON object to write to
     * @param key The key to place the value
     * @param value The value to add
     */
    public static void safePutString(JSONObject obj, String key, String value) {
        if (obj == null || isEmpty(key)) return;
        try {
            obj.put(key, value);
        } catch (JSONException e) {
            System.err.println("Could not put string with key "+key);
        }
    }
    
    protected static boolean isEmpty(String string) {
        return string == null || string.trim().isEmpty();
    }
}
