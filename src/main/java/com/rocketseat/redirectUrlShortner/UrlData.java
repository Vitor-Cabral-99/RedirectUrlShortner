package com.rocketseat.redirectUrlShortner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
// lombok nao funcionou pra gerar os objetos da UrlData, então criei na marra
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter


public class UrlData {
    private String originalUrl;
    private long expirationTime;
}