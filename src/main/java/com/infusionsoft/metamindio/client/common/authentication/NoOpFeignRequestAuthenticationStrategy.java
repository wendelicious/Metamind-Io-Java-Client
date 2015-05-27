package com.infusionsoft.metamindio.client.common.authentication;

import feign.Feign.Builder;

public class NoOpFeignRequestAuthenticationStrategy implements FeignRequestAuthenticationStrategy {

    @Override
    public Builder requestInterceptor(Builder feign) {
        return feign;
    }

}

