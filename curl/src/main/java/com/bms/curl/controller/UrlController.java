package com.bms.curl.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.bms.curl.domain.DimUrl;
import com.bms.curl.repository.UrlDao;

@RestController
@RequestMapping("/curl")
public class UrlController {
    @Autowired
    private UrlDao urlDao;

    @RequestMapping(method = RequestMethod.GET, value = "/{shortUrlId}")
    public RedirectView redirectTest(@PathVariable String shortUrlId) {
        DimUrl dbUrl = urlDao.findById(shortUrlId).get();
        return new RedirectView(dbUrl.getUrl());
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public String addUrl(@RequestParam String url) {
        System.out.println("Url received from API: " + url);
        if (url == null) {
            return "Null url not allowed";
        }

        DimUrl dimUrl = new DimUrl();
        dimUrl.setId(getUniqueId());
        dimUrl.setUrl(url);
        dimUrl.setDateAdded(LocalDate.now());
        DimUrl savedUrl = urlDao.save(dimUrl);

        System.out.println("Saved this url: " + savedUrl);

        return "Short URL: http://localhost:8081/" + savedUrl.getId();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/url")
    public String getUrl(@RequestParam String shortUrlId) {
        System.out.println("Fetching long url for the shortUrlId: " + shortUrlId);
        DimUrl dbUrl = urlDao.findById(shortUrlId).get();
        return dbUrl == null ? "No URL matched" : dbUrl.getUrl();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/all")
    public Iterable<DimUrl> getAllUrls() {
        return urlDao.findAll();
    }

    private String getUniqueId() {
        int result = 0;
        for (var url : urlDao.findAll()) {
            result++;
        }
        return Integer.toString(result);
    }
}
