# JPA-Query
Spring Data JPA'da `@Query` anotasyonu, özelleştirilmiş sorguları tanımlamak ve kullanmak için kullanılan bir anotasyondur. Bu anotasyon, JpaRepository veya CrudRepository gibi Spring Data JPA arabirimlerine eklenen yöntemler üzerine yerleştirilir ve bu yöntemler, belirli bir sorguyu veya veritabanı işlemini temsil eder. @Query kullanarak, JPQL (Java Persistence Query Language), SQL veya özel bir sorgu dili kullanabilir ve bu sorguları veritabanında çalıştırabilirsiniz.

#### @Query anotasyonu ile ilgili bazı önemli noktalar şunlardır:
* `@Query` anotasyonu, SQL tabanlı veya JPQL (Java Persistence Query Language) tabanlı sorguları kullanmanıza olanak tanır. nativeQuery parametresini true olarak ayarlarsanız, doğrudan SQL sorgusu kullanabilirsiniz.<br>
* JPQL sorgularında, var olan JPA varlıklarını (entity) kullanarak sorguları tanımlayabilirsiniz. Bu, veritabanı tabloları yerine Java sınıfları ve alanlarını kullanmanıza olanak tanır.<br>
* `@Param` anotasyonu, sorguya parametre geçişini kolaylaştırır ve metot parametrelerini sorgu içinde kullanmanızı sağlar.<br>
* `@Query` anotasyonunu kullanarak sorgu sonuçlarını belirli bir DTO (Data Transfer Object) sınıfına veya özel bir projeksiyon sınıfına dönüştürebilirsiniz.<br>
* Bu anotasyon, veritabanı işlemlerini özelleştirmenin yanı sıra, performans iyileştirmeleri ve karmaşık sorguların oluşturulması gibi birçok senaryoda kullanışlıdır.<br>
