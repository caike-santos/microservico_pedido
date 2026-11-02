package pedido.service;

import org.springframework.stereotype.Service;
import pedido.model.ItemPedido;
import pedido.model.Pedido;
import pedido.repository.PedidoRepository;

import java.util.List;

@Service
public class PedidoService {
    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository){
        this.pedidoRepository = pedidoRepository;
    }

    public Pedido salvarPedido(Pedido pedido){
        if(pedido.getItens() != null){
            for(ItemPedido item : pedido.getItens()){
                item.setPedido(pedido);
            }
        }
        return pedidoRepository.save(pedido);
    }

    public List<Pedido> listarPedidos(){
        return pedidoRepository.findAll();
    }
}
