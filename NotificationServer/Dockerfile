FROM mcr.microsoft.com/dotnet/sdk:3.1.411-focal AS build

WORKDIR /source




# copy csproj and restore as distinct layers

COPY . .

#COPY NotificationServer/*.csproj ./aspnetapp/

RUN dotnet restore -r linux-x64


# copy everything else and build app

RUN dotnet publish -c release -o /app -r linux-x64 --self-contained false --no-restore


# final stage/image

FROM mcr.microsoft.com/dotnet/aspnet:3.1.17-focal

WORKDIR /app

COPY --from=build /app ./

ENTRYPOINT ["./NotificationServer"]
