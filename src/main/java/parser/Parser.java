package parser;

import models.Transaction;

import java.util.List;

public interface Parser {
    String getSupportedExtension();
    List<Transaction> parseFile(String path);
}
