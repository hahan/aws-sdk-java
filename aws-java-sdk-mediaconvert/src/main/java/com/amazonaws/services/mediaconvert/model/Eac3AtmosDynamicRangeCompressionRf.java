/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.mediaconvert.model;

import javax.annotation.Generated;

/**
 * Specify how the service limits the audio dynamic range when compressing the audio.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum Eac3AtmosDynamicRangeCompressionRf {

    NONE("NONE"),
    FILM_STANDARD("FILM_STANDARD"),
    FILM_LIGHT("FILM_LIGHT"),
    MUSIC_STANDARD("MUSIC_STANDARD"),
    MUSIC_LIGHT("MUSIC_LIGHT"),
    SPEECH("SPEECH");

    private String value;

    private Eac3AtmosDynamicRangeCompressionRf(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return Eac3AtmosDynamicRangeCompressionRf corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static Eac3AtmosDynamicRangeCompressionRf fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (Eac3AtmosDynamicRangeCompressionRf enumEntry : Eac3AtmosDynamicRangeCompressionRf.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
