package pedido.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pedido.model.Pedido;

import java.util.UUID;

public interface PedidoRepository extends JpaRepository<Pedido, UUID> {
}
