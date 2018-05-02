package com.breviary.repositories;

import com.breviary.entities.Widget;
import org.springframework.data.repository.CrudRepository;


public interface WidgetRepository extends CrudRepository<Widget, Integer> {

}