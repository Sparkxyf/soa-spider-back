package com.soa.spider.domain;

import lombok.*;

@Data
@Setter
@Getter
@RequiredArgsConstructor
@ToString
public class NewsRoot {
    public String company;

    public String url;

    public String category;

}
