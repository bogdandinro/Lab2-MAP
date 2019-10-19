package factory;

import container.Container;
import container.ContainerStrategy;

public interface Factory {
    Container createContainer(ContainerStrategy strategy);
}
