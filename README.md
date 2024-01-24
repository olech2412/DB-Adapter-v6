# DB-Adapter-v6
[![Build-CVE-Pipeline](https://github.com/olech2412/DB-Adapter-v6/actions/workflows/Build-Test-Pipeline.yml/badge.svg?branch=master)](https://github.com/olech2412/DB-Adapter-v6/actions/workflows/Build-Test-Pipeline.yml) [![Publish package to GitHub Packages](https://github.com/olech2412/DB-Adapter-v6/actions/workflows/publishPackage.yml/badge.svg)](https://github.com/olech2412/DB-Adapter-v6/actions/workflows/publishPackage.yml) [![CVE scan](https://github.com/olech2412/DB-Adapter-v6/actions/workflows/cve-scan.yml/badge.svg)](https://github.com/olech2412/DB-Adapter-v6/actions/workflows/cve-scan.yml) [![codecov](https://codecov.io/gh/olech2412/DB-Adapter-v6/graph/badge.svg?token=CKROXWUMJQ)](https://codecov.io/gh/olech2412/DB-Adapter-v6) ![GitHub License](https://img.shields.io/github/license/olech2412/DB-Adapter-v6)

This is an adapter for this rest-api: https://github.com/derhuerst/db-rest. It can be used as a maven dependency and provides all models

## Installation 🔧

Add the following to your pom.xml:

```xml

<dependency>
    <groupId>de.olech2412.adapter</groupId>
    <artifactId>db-adapter-v6</artifactId>
    <version>1.1.0</version>
</dependency>
```

To access the package you have to add these lines in your Maven 'settings.xml':

```xml

<server>
    <id>github</id>
    <username>olech2412</username>
    <password>$PACKAGE_READ_KEY</password>
</server>
```

To get the key please create an issue with the 'key request' label.

## Usage

### Basic usage 👶

```java
package org.example;

import de.olech2412.adapter.dbadapter.APIConfiguration;
import de.olech2412.adapter.dbadapter.DB_Adapter_v6;
import de.olech2412.adapter.dbadapter.exception.Error;
import de.olech2412.adapter.dbadapter.exception.Result;
import de.olech2412.adapter.dbadapter.model.station.Station;

import java.io.IOException;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        APIConfiguration apiConfiguration = new APIConfiguration(); // The configuration of the api
        // No further configuration is needed
        DB_Adapter_v6 dbAdapterV6 = new DB_Adapter_v6(apiConfiguration); // The adapter that is used to make requests with the configuration

        Result<Station, Error> stationResult = dbAdapterV6.getStationById(80002611, Collections.emptyList()); // Get the stationResult with the id 8000261 (München Hbf)

        if (stationResult.isSuccess()) stationResult.getData().getName(); // Get the name of the station
        else stationResult.getError().getMessage(); // Get the error message
    }
}
```

### Advanced usage with proxy and parameters 👨‍💻

```java
package org.example;

import de.olech2412.adapter.dbadapter.APIConfiguration;
import de.olech2412.adapter.dbadapter.DB_Adapter_v6;
import de.olech2412.adapter.dbadapter.exception.Error;
import de.olech2412.adapter.dbadapter.exception.Result;
import de.olech2412.adapter.dbadapter.model.trip.Trip;
import de.olech2412.adapter.dbadapter.request.parameters.Parameter;
import de.olech2412.adapter.dbadapter.request.parameters.RequestParametersNames;

import java.io.IOException;
import java.net.Proxy;

public class Main {
    public static void main(String[] args) throws IOException {
        APIConfiguration apiConfiguration = new APIConfiguration(); // The configuration of the api
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new java.net.InetSocketAddress("bla", 8080));
        apiConfiguration.setProxy(proxy);

        DB_Adapter_v6 db_adapter_v6 = new DB_Adapter_v6(apiConfiguration);

        Result<Trip[], Error> departuresResult = db_adapter_v6.getDeparturesByStopId(8010205, new Parameter.ParameterBuilder().add(RequestParametersNames.RESULTS, 1).build());

        if (departuresResult.isSuccess()) {
            System.out.println(departuresResult.getData()[0]);
        } else {
            System.out.println(departuresResult.getError());
        }
    }
}
```

## Thanks to [@derhuerst](https://github.com/derhuerst) 🙏

Thanks for providing this amazing REST API: https://github.com/derhuerst/db-rest 
