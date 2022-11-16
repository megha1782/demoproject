package com.demoproject.core.models;

import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.api.resource.Resource;
import javax.inject.Inject;
import java.util.List;

@Model(adaptables= Resource.class)
public class CarouselHome {
    @Inject
    private List<BannerHome> bannerList;

    public List<BannerHome> getBannerList() {
        return bannerList;
    }
}