package com.demoproject.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;
import java.util.List;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class PublishedBlogsModel {
    @Inject
    @Default(values="multifield")
    private List<PublishedBlogsField> publishedBlogsFieldList;

    public List<PublishedBlogsField> getPublishedBlogsFieldList() {
        return publishedBlogsFieldList;
    }
}
