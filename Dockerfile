FROM openjdk:11
RUN mkdir/app
COPY out/production/addition/ /app
WORKDIR /app
CMD java Main