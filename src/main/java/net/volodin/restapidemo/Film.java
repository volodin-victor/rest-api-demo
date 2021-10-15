package net.volodin.restapidemo;

import org.hibernate.annotations.Type;
import org.hibernate.mapping.Array;
import org.hibernate.type.ArrayType;
import org.hibernate.type.BigDecimalType;
import org.hibernate.type.TimestampType;

import javax.persistence.*;


@Entity
@Table(name = "film")
public class Film {
    @Id
    @Column(name = "film_id", updatable = false, nullable = false)
    @Type(type = "int")
    @GeneratedValue(generator = "film_film_id_seq")
    private Long filmId;
    private String title;
    private String description;
//    private Year releaseYear; //TODO: need to adjust
    private Short languageId;
    private Short rentalDuration;
    private BigDecimalType rentalRate;
    private Short length;
    private BigDecimalType replacementCost;
    private String rating;
    private TimestampType lastUpdate;
//    private  specialFeatures;
//    @Column(name = "fulltext", nullable = false)
//    private StringType fullText;//TODO: need to adjust

    public Film(String title,
                String description,
                Short languageId,
                Short rentalDuration,
                BigDecimalType rentalRate,
                Short length,
                BigDecimalType replacementCost,
                String rating,
                TimestampType lastUpdate) {
        this.title = title;
        this.description = description;
        this.languageId = languageId;
        this.rentalDuration = rentalDuration;
        this.rentalRate = rentalRate;
        this.length = length;
        this.replacementCost = replacementCost;
        this.rating = rating;
        this.lastUpdate = lastUpdate;
    }

    public Long getFilmId() {
        return filmId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Short getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Short languageId) {
        this.languageId = languageId;
    }

    public Short getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(Short rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public BigDecimalType getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(BigDecimalType rentalRate) {
        this.rentalRate = rentalRate;
    }

    public Short getLength() {
        return length;
    }

    public void setLength(Short length) {
        this.length = length;
    }

    public BigDecimalType getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(BigDecimalType replacementCost) {
        this.replacementCost = replacementCost;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public TimestampType getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(TimestampType lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "Film{" +
                "filmId=" + filmId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", languageId=" + languageId +
                ", rentalDuration=" + rentalDuration +
                ", rentalRate=" + rentalRate +
                ", length=" + length +
                ", replacementCost=" + replacementCost +
                ", rating='" + rating + '\'' +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
