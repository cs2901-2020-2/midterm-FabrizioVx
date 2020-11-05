package midterm;

import java.io.IOException;

public interface Observers {
    boolean update(Subject other) throws IOException;
}
