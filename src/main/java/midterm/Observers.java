package midTerm;

import java.io.IOException;

public interface Observers {
    void update(Subject other) throws IOException;
}