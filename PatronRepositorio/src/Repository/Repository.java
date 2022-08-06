/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import specification.Specification;
import java.util.List;

/**
 *
 * @author Alexander Elias
 * @param <T>
 */
public interface Repository<T> {
    
    void add(T t);
    List<T> getAll();
    List<T> findBySpecification(Specification specification);
    void update(T oldT, T newT);
    void remove (long id);
    
}
