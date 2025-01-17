package pibackend.domain.bookcovers.model.mapper;

import org.mapstruct.Mapper;
import pibackend.domain.bookcovers.model.entity.BookCover;
import pibackend.domain.bookcovers.model.view.BookCoverView;

@Mapper
public interface BookCoverMapper {

    BookCoverView toView(BookCover entity);

    BookCover toEntity(BookCoverView view);

}
