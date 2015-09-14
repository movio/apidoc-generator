apidoc-generator
================
Code generators for http://apidoc.me provided by Gilt.


## Running site locally
1. Clone/download this repo
2. Build the docker image
  
      ```docker build -t apidoc-generator .```
  2. Configure docker-compose.yml, perhaps changing ports / volumes. You might want to map your ivy2 cache in to avoid long start up times
  4. Start the container
  
      ```docker-compose up```
