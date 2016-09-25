
package com.org.contrats.usecases;

import com.org.person.model.PersonModel;

/**
 * To inform.
 * 
 * @author  : admin
 * @project : use-cases
 * @package : com.org.person.contrats.usecases
 * @date    : 17 sept. 2016 18:40:58
 */
public interface CreateOrUpdate
{
   /**
    * 
    * @param model
    * @return
    */
   PersonModel createPerson( PersonModel model );
   
   /**
    * 
    * @param model
    * @return
    */
   PersonModel updatePerson( PersonModel model );
}
