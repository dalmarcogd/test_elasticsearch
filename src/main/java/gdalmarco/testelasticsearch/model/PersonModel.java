package gdalmarco.testelasticsearch.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "person", type = "person", shards = 1, replicas = 0, refreshInterval = "-1")
public class PersonModel {

	@Id
	private Long id;
	private String name;
	private LocalDate birth;
	private String cpf;
	private String email;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public LocalDate getBirth() {
		return birth;
	}
	
	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}	
	
	@Override
	public String toString() {
		return String.format("Person[id=%s, name='%s', birth='%s', cpf='%s', email='%s']", 
				this.id, this.name, this.birth, this.email);
	}
}