package com.demoproject.core.servicesimpl;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "Published Osgi")
public  @interface PublishedPageOsgiConfiguration {
    @AttributeDefinition(name = "Enter Number Of Blogs")
    int noOfBlogs();

}
