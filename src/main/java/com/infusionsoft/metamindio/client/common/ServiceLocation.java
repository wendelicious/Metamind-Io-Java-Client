package com.infusionsoft.metamindio.client.common;

import java.net.URI;

public class ServiceLocation {
    private final URI uri;

    public ServiceLocation(URI uri){
        this.uri = uri;
    }

    public URI getEndpointUri(){
        return this.uri;
    }
}

