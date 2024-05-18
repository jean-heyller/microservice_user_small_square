package com.example.microservice_user.adapters.driven.driving.http.util;

public class AdapterConstants {
    private AdapterConstants() {throw new IllegalStateException("Utility class");}

    public enum field{
        NAME,
        DESCRIPTION,

    }

    public static final String FIELD_NAME_NULL_MESSAGE = "`name` cannot be null";

    public static final String FIELD_DESCRIPTION_NULL_MESSAGE = "`description` cannot be null";

}
