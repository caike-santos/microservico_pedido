package pedido.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pedido.model.ItemPedido;

import java.util.UUID;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, UUID> {
}
