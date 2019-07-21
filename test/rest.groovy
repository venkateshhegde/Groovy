package test

import groovyx.net.http.RESTClient

@Grab('org.codehaus.groovy.modules.http-builder:http-builder:0.7.1')

String base = "http://api.icndb.com"


def chuck =new RESTClient (base)

chuck.contentType =groovyx.net.http.ContentType.JSON

chuck.get(path: '/jokes/random'){response, json ->
    println response.status
    println json
}




String base2 = 'http://yahoo.com'

def chuck2 =new RESTClient (base)


chuck.get(path: '/index.html'){response, html ->
    println response.status
    println html
}






