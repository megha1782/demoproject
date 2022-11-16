package com.demoproject.core.servicesimpl;

import com.demoproject.core.services.PublishedPageOsgi;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;

@Component(service = PublishedPageOsgi.class)
@Designate(ocd = PublishedPageOsgiConfiguration.class)
public class PublishedPageOsgiImpl implements PublishedPageOsgi {
    int blogs;

    @Activate
    public void activate(PublishedPageOsgiConfiguration config){
        blogs = config.noOfBlogs();
    }


    @Override
    public int noOfPages() {
        return blogs;
    }


}
