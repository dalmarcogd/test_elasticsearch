package gdalmarco.testelasticsearch.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "gdalmarco.testelasticsearch")
public class ElasticsearchConfig {

}
