# Spring Boot Swagger Sample
This small projects exposes a simple rest interface with Swagger2 ([springfox-swagger2](https://github.com/springfox/springfox)) enabled.

# Running application
It's a standard Spring Boot application than can be started with the following command:
`mvn spring-boot:run`

# Issues to solve
- The swagger spec is not exposing the @XmlAttribute as attributes. Missing the following config:
```xml
  "xml": {
    "attribute": true
  }
```

# Access sample controller
The sample controller is exposed on the path `http://localhost:8080/sample` and will return the following static XML 
```xml
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<Sample value="sampleValue" code="2"/>
```

# Access Swagger2 spec
The Swagger2 spec is exposed on the following path `http://localhost:8080/v2/api-docs` and will return the following JSON:

```json
{
    "swagger": "2.0",
    "info": {
        "description": "Api Documentation",
        "version": "1.0",
        "title": "Api Documentation",
        "termsOfService": "urn:tos",
        "contact": {},
        "license": {
            "name": "Apache 2.0",
            "url": "http://www.apache.org/licenses/LICENSE-2.0"
        }
    },
    "host": "localhost:8080",
    "basePath": "/",
    "tags": [
        {
            "name": "sample-controller",
            "description": "Sample Controller"
        }
    ],
    "paths": {
        "/sample": {
            "get": {
                "tags": [
                    "sample-controller"
                ],
                "summary": "sample",
                "operationId": "sampleUsingGET",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "application/xml"
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/Sample"
                        }
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                }
            }
        }
    },
    "definitions": {
        "Sample": {
            "type": "object",
            "required": [
                "value"
            ],
            "properties": {
                "code": {
                    "type": "string",
                    "enum": [
                        "1",
                        "2"
                    ]
                },
                "value": {
                    "type": "string"
                }
            }
        }
    }
}
```
