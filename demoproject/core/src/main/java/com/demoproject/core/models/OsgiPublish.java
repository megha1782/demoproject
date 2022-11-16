package com.demoproject.core.models;

import com.demoproject.core.services.PublishedPageOsgi;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Model(adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class OsgiPublish {
    @Inject
    @Named("./publishedBlogs")
    private List<BlogFields> publishedBlogs;

    @OSGiService
    PublishedPageOsgi  publishedPageOsgi;

    int numBlogs;

    public List<BlogFields> getPublishedBlogs() {
        return publishedBlogs;
    }

    public int getNumBlogs() {
        return publishedPageOsgi.noOfPages();
    }

}
