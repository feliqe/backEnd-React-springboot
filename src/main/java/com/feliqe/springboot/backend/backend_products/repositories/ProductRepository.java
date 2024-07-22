package com.feliqe.springboot.backend.backend_products.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.feliqe.springboot.backend.backend_products.entities.Product;

//para realizar la vinclacion con e frontend de react
@CrossOrigin(origins = "http://localhost:5173/")
//controlador de CRUD completo por medio de la configuracion de spring
@RepositoryRestResource(path = "products")
public interface ProductRepository  extends CrudRepository<Product, Long>{

}
