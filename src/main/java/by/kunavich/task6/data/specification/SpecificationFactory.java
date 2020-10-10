package by.kunavich.task6.data.specification;

import by.kunavich.task6.data.BookField;
import by.kunavich.task6.model.Book;

public class SpecificationFactory {
    public Specification create(BookField field)  {
        switch (field)
        {
            case TITEL:
                return new TitelBookSpecification();
            case AUTHOR:
                return new AuthorBookSpecification();
            case LENGTH:
                return new LengthBookSpecification();
            case PUBLISHER:
                return new PublisherBookSpecification();
            default:
                throw new IllegalArgumentException("wrong Book's field"+ field);
        }


    }
}
