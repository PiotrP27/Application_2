package pl.application;


import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;


public class App 
{
    public static void main(String[] args) {
        final ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        final Validator validator = validatorFactory.getValidator();

        Address adres1 = new Address("Krakow","Ulica","37-565",5);
        Address adres2 = new Address("al","alaaa,","2",0);



        final Set<ConstraintViolation<Address>> adres1ContraintViolations = validator.validate(adres1);
        if(adres1ContraintViolations.isEmpty()){
            System.out.println("Wszystko ok z adres 1 ");
        }else{
            for (ConstraintViolation<Address> validationError : adres1ContraintViolations){
                System.out.println(validationError.getPropertyPath().toString() + " - " + validationError.getMessage());
            }
        }



        final Set<ConstraintViolation<Address>> adres2ContraintViolations = validator.validate(adres2);
        if(adres2ContraintViolations.isEmpty()){
            System.out.println("Wszystko ok z adres 2");
        }else{
            for (ConstraintViolation<Address> validationError : adres2ContraintViolations){
                System.out.println(validationError.getPropertyPath().toString() + " - " + validationError.getMessage());
            }
        }

    }
}
