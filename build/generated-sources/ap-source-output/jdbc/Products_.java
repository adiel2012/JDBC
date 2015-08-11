package jdbc;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-08-10T22:21:57")
@StaticMetamodel(Products.class)
public class Products_ { 

    public static volatile SingularAttribute<Products, Integer> id;
    public static volatile SingularAttribute<Products, Float> price;
    public static volatile SingularAttribute<Products, Integer> stockQty;
    public static volatile SingularAttribute<Products, String> productDescription;
    public static volatile SingularAttribute<Products, String> productName;

}