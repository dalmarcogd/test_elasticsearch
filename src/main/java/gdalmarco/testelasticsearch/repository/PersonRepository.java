package gdalmarco.testelasticsearch.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import gdalmarco.testelasticsearch.model.PersonModel;

/**
 * Represent the generic repository to keep any thing.
 * 
 * @author Guilherme Dalmarco 
 */
public interface PersonRepository extends ElasticsearchRepository<PersonModel, Long> {

}