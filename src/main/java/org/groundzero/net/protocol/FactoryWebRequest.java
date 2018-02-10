package org.groundzero.net.protocol;

import java.io.BufferedReader;
import java.io.IOException;

public interface FactoryWebRequest {
    WebRequest newWebRequest (final BufferedReader reader) throws IOException;
}
