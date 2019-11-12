package com.soa.spider.domain;

import lombok.*;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@Setter
@Getter
@RequiredArgsConstructor
@ToString
@XmlRootElement
public class Application {
    public String title;

    public String applyTime;

    public String announceTime;

    public String owner;

    public String category;

    public String content;

    public String curTime;

}
