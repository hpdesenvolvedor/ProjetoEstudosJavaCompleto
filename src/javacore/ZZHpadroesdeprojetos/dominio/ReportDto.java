package javacore.ZZHpadroesdeprojetos.dominio;

public class ReportDto {
    private String aircraftName;
    private Moeda moeda;
    private Pessoa pessoa;

    public static final class ReportDtoBuilder {
        private String aircraftName;
        private Moeda moeda;
        private Pessoa pessoa;

        private ReportDtoBuilder() {
        }

        public static ReportDtoBuilder builder() {
            return new ReportDtoBuilder();
        }

        public ReportDtoBuilder withAircraftName(String aircraftName) {
            this.aircraftName = aircraftName;
            return this;
        }

        public ReportDtoBuilder withMoeda(Moeda moeda) {
            this.moeda = moeda;
            return this;
        }

        public ReportDtoBuilder withPessoa(Pessoa pessoa) {
            this.pessoa = pessoa;
            return this;
        }

        public ReportDto build() {
            ReportDto reportDto = new ReportDto();
            reportDto.moeda = this.moeda;
            reportDto.aircraftName = this.aircraftName;
            reportDto.pessoa = this.pessoa;
            return reportDto;
        }
    }
}
