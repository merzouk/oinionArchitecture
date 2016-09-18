
package com.org.contrat;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * A Renseigner.
 * @author  : admin
 * @project : contrat
 * @package : com.org.contrat
 * @date    : 16 sept. 2016 22:51:48
 */
public interface ObjectContrat<T, I extends Serializable>
{
   /**
    * 
    * @param primaryKey
    * @return
    */
   T findById( I primaryKey );
   
   /**
    * 
    * @param t
    * @return
    */
   T save( T t );
   
   /**
    * 
    * @param t
    * @return
    */
   T update( T t );
   
   /**
   * 
   * @param primaryKey
   */
   void deleteById( I primaryKey );
   
   /**
    * 
    * @return
    */
   List<T> findAll();
   
   /**
    * 
    */
   void deleteAll();
   
   /**
   * 
   * @param primaryKey
   * @return
   */
   boolean isExist( I primaryKey );
}
