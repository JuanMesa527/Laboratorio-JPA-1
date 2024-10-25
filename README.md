# Explicacion entidad Producto
Al agregar la entidad con la anotacion @OneToMany, crea una realcion entre las 
2 entidades o tablas indicando que la entidad producto en su campo Competitor 
hara referencia a un solo competidor,
mientras que la entidad Competitor puede tener múltiples Productos. En la base 
de datos se adiciona una columna con clave foranea en la tabla de Producto que 
hace referencia a la clave principal del Competitor al que pertenece.