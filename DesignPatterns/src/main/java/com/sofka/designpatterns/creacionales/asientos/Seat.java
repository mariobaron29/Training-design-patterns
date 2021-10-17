package com.sofka.designpatterns.creacionales.asientos;

public class Seat {
    private String cover;
    private String type;

    public String getCover() {
        return cover;
    }

    public String getType() {
        return type;
    }

    private Seat(String cover, String type) {
        this.cover = cover;
        this.type = type;
    }

    public static class SeatBuilder {
        private String cover;
        private String type;

        public SeatBuilder setCover(String cover) {
            this.cover = cover;
            return this;
        }

        public SeatBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public Seat createSeat() {
            return new Seat(cover, type);
        }
    }
}

