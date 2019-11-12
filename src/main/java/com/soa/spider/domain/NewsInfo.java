package com.soa.spider.domain;

import lombok.*;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@Setter
@Getter
@RequiredArgsConstructor
@ToString
@XmlRootElement
public class NewsInfo {
    public String company;

    public String url;

    public String category;

    public String content;

    public String curTime;
}
