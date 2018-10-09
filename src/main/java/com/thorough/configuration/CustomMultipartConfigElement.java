package com.thorough.configuration;


import javax.servlet.MultipartConfigElement;
import javax.servlet.annotation.MultipartConfig;



public class CustomMultipartConfigElement extends MultipartConfigElement {
    public CustomMultipartConfigElement(String location) {
        super(location);
    }

    public CustomMultipartConfigElement(String location, long maxFileSize, long maxRequestSize, int fileSizeThreshold) {
        super(location, maxFileSize, maxRequestSize, fileSizeThreshold);
    }

    public CustomMultipartConfigElement(MultipartConfig annotation) {
        super(annotation);
    }
}
