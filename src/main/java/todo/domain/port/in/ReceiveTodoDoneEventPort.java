package todo.domain.port.in;

import common.architecture.Port;
import todo.domain.event.TodoDoneEvent;

@Port
public interface ReceiveTodoDoneEventPort {

    void receive(TodoDoneEvent event);
}
