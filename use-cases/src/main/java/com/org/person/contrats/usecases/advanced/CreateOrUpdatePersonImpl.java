
package com.org.person.contrats.usecases.advanced;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.contrats.usecases.CreateOrUpdate;
import com.org.person.contrat.PersonContrat;
import com.org.person.model.PersonModel;

/**
 * To inform.
 * 
 * @author  : admin
 * @project : use-cases
 * @package : com.org.person.contrats.usecases.advanced
 * @date    : 17 sept. 2016 18:41:57
 */
@Service("createOrUpdate")
public class CreateOrUpdatePersonImpl implements CreateOrUpdate
{
   
   private static final Logger        logger = LoggerFactory.getLogger( CreateOrUpdatePersonImpl.class );
   
   @Autowired
   private PersonContrat<PersonModel> personContrat;
   
   /**
    * @see com.org.contrats.usecases.CreateOrUpdate#createPerson(com.org.person.model.PersonModel)
    */
   @Override
   public PersonModel createPerson( PersonModel model )
   {
      logger.info( "createPerson" );
      return personContrat.save( model );
   }
   
   /**
    * @see com.org.contrats.usecases.CreateOrUpdate#updatePerson(com.org.person.model.PersonModel)
    */
   @Override
   public PersonModel updatePerson( PersonModel model )
   {
      logger.info( "updatePerson" );
      return personContrat.update( model );
   }
}
