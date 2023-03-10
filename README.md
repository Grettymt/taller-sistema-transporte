# Taller final - sistema de transporte

---

### ¿Cómo correr el proyecto?
> 1. Posterior a clonar este repositorio en su ordenador, presionar clic derecho en el archivo "AppSistemaTransporteApplication".
> 2. Presionar la opción Run.

### Desarrollo del proyecto
> 1. Identificar las entidades involucradas en el sistema, como por ejemplo bus, viaje.
> 2. Identificar las características comunes.
> 3. Identificar las acciones comunes.
> 4. Identificar interfaces.
> 5. Identificar los métodos del api.
> 6. Definir estructura del api.
> 7. Definir controladores.

### Estructura de las carpetas
> - clases: Clases abstractas o plantillas para la creación de clases complejas.
> - controller: Controladores para recibir peticiones del api.
> - interfaces: Interfaces contienen los métodos abstractos, estos comportamientos son aplicados solo por las clases que implementen la interface.
> - model: Modelos o representación de los tipos de datos de la api.
> - repository: Clases para la manipulación de los datos y la lógica de negocio.

## Documentación de la API

---

### Registrar destino
| Url | Método | 
|----|----|
| `/api/destino/guardar` | `post` |

Tipo (Destino)
```json
{
  "nombreDestino": "String",
  "departamento": "String",
  "ciudad": "String"
}
```

### Listar destino
| Url | Método | 
|----|----|
| `/api/destino/listar` | `get` |

---

### Registrar bus
| Url | Método | 
|----|----|
| `/api/bus/guardar` | `post` |

Tipo (Vehiculo)
```json
{
  "placa": "String",
  "tipo": "String"
}
```

### Listar buses
| Url | Método | 
|----|----|
| `/api/bus/listar` | `get` |

---

### Asignar un conductor al bus
| Url | Método | 
|----|----|
| `/api/bus/asignar/{placa}` | `put` |

Tipo (Vehiculo)
```json
{
  "nombre": "String",
  "apellido": "String",
  "cedula": "String",
  "telefono": int,
  "numeroLicencia": "String"
}
```

---

### Registrar viaje
| Url | Método | 
|----|----|
| `/api/viaje/guardar/{idDestino}/{idBus}` | `post` |

Tipo (Viaje)
```json
{
  "hora": "String"
}
```

### Listar viaje
| Url | Método | 
|----|----|
| `/api/viaje/listar` | `get` |

---

### Ingresar pasajeros al bus
| Url | Método | 
|----|----|
| `/api/viaje/ingresar-pasajero/{idViaje}` | `post` |

Tipo (Viaje)

```json
{
  "nombre": "String",
  "apellido": "String",
  "cedula": "String",
  "telefono": int,
  "numeroMaletas": int
}
```

---

## Patrones de diseño aplicados

- Singleton: Se aplicó en la clase "TerminalTransporteRepository", con el fin de que no se crearan muchas terminales de transporte sino solo una.
- Factory Method: Se aplicó por medio de la creación de las interfaces "IRepository" y "IVehiculo".