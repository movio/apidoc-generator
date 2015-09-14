FROM giltarchitecture/ubuntu-jvm:0.6

MAINTAINER architecture@gilt.com

ADD . /usr/share/apidoc-generator

WORKDIR /usr/share/apidoc-generator

RUN ln -s /usr/share/apidoc-generator/generator/target/universal/stage /usr/share/apidoc-generator-generator
