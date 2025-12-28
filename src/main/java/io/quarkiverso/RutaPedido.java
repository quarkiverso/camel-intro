package io.quarkiverso;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RutaPedido extends RouteBuilder {

    @Override
    public void configure() {
        from("platform-http:/api/pedido?httpMethodRestrict=POST")
            .unmarshal().json(JsonLibrary.Jackson, Pedido.class)
            .log("📦 Recibido: ${body.id} - ${body.producto}")
            
            .process(exchange -> {
                Pedido pedido = exchange.getIn().getBody(Pedido.class);
                pedido.setProcesado(true);
            })
            
            .marshal().json(JsonLibrary.Jackson)
            .log("✅ Procesado");
    }
}
