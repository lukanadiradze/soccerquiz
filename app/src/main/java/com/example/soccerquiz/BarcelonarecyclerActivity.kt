package com.example.soccerquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class BarcelonarecyclerActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barcelonarecycler)
        recyclerView = findViewById(R.id.imageRecyclerView)

        val surati = ArrayList<Barcelona_images>()

        surati.add(Barcelona_images("https://lh3.googleusercontent.com/OQZi4ckWAs7UrOlZEPefXZgJOcdJuSM5FSH9zqD5rMg6c2MOaxcKpV5IMrb1Tju98fWyNmcI33E4RGb0uC09Ej4W"))
        surati.add(Barcelona_images("https://images2.minutemediacdn.com/image/fetch/c_fill,g_auto,f_auto,h_379,w_593/https%3A%2F%2Fplayingfor90.com%2Ffiles%2F2015%2F06%2FBarcelona-UCL-win.png"))
        surati.add(Barcelona_images("https://90l.tribuna.com/images/70/dc/21/70dc217d3c41449bbdcab960e090f57b500x500@2x.jpg"))
        surati.add(Barcelona_images("https://cdn.vox-cdn.com/thumbor/rvf49DowTpx5Ot1YEyt0Cv743ko=/0x39:3958x2678/1200x800/filters:focal(0x39:3958x2678)/cdn.vox-cdn.com/uploads/chorus_image/image/46489986/GettyImages-476126902.0.jpg"))
        surati.add(Barcelona_images("data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBxMTEhUTExMVFRUVFxUYFRUVFRUVFRUXFRUXFhYVFRcYHSggGBolHRUVITEhJSkrLi4uFx8zODMtNygtLisBCgoKDg0OGhAQGi0lHyUtLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLf/AABEIALcBEwMBEQACEQEDEQH/xAAcAAABBQEBAQAAAAAAAAAAAAADAQIEBQYABwj/xAA+EAABBAAEBAQDBgUDAgcAAAABAAIDEQQSITEFBkFREyJhcTKBoQcUQpHB8CNSsdHhYmPxFqIVJFNkgpLS/8QAGgEAAwEBAQEAAAAAAAAAAAAAAAECAwQFBv/EADoRAAICAQMCAggEBQMEAwAAAAABAhEDEiExBEETUSJhcYGRsdHwBTKhwRRCYuHxFSM0M1OCkgZSY//aAAwDAQACEQMRAD8A8NQByAOQByAOQByAOQByAOQByYHIoBUUByYHIAUBOgFAToQoCdCHBqdCseGpise1iBWPbGgAzYkDDtgRQw7cOigCNw6TAkR4ZSykTIMGeyzkNGo4DwAyHQe4XFly6Tpxws9K4Tyc1rRY62sMeubtFynGOxYy8oREVp6aLujja5OeU7MHzVyt4RPZaxVGbZhsTg2grVIlsmcucWdhJ2zRgZm2KIsEEUQVppT2M3fJqeK/aPin/CWxNIqmDX3zHUH2T8OKFqk+Sm/6qlOpkcT1JcUC0njS5joOQByAOQByAOToBUUB1IoDqToDkALSAOpMDqToQtIoBQExDgE6Cx4amTY9rECsK2NABWxIEHZCmNEuHDWgLLGDh5I2QJsmjhJ7dkBYaLhBJ2ToNSL/AIVyjJJVMJ26JOJSkaXA/Z5Juab7rGVGiZsuActCDUkOPoNiuOXT6pW+DbxfRpGhXSkkqRicmBjudXseN9gritiWzyTirQCVaEUcs1KhUAkxJRYUC8UpWOkZBYFnIA5MBaToBaQB1JgLSKEdSdAdSKA6kUB1IoBaTA4BFCscAnQrHBqYmwjWIJsK2NMAzIkAHbCgCRHh0wJuHwZPROhWaPhHAnPIAH+UqJ1HonBeRrbbhV9/bp3ChySGk2aJnJ0XX02HZLxCvDZIg5Sw7TZBPbp80eKx+Ei7w8DWANaAAFm229zRRS4AYziUcfxO17DUpqLYnNGcxHN1upoAHfc0ufNqrY1x0+SW3mdlDUdVyeJl4s28KPJU8S5tFaHpst8d9yJJLgxfGuOF+x1P1XZHYwaMjjnOJ1WiYOJBEGqongZNh9LUpFMAGBUSY9YFigJgKAnQrFpOgHZU0gFyooVihqdCs7Kigs7KnQWdlSoLEpFBYuVAWKGpiseGoE2EaxOiQ8caAJUcFpoCZBhCU6FZZ4ThLnbAp0LUXMXK01D+G4+wOputEtkFmy5U5Bc/zSgsaNNRTvUUf6pPJFIFCTZ6DwzlyGHUCz6rGWRs1WNIuFBoMkkDRZNBNJvgTaXJQ8X5lbGKZRP72W0MPmYyyvsZWbm95J8x/Nb6ElwZW2Z7ifMea9VlIuKKSTizlhKNnREb/wCKPoa9Vjo3NUxHYo6Eq1EHuCdiA43VKyCNjJgfdUhA44XuIytK0W5EtgknBnkmzQ7KlEnUDHDYxoXa+6elE6medALmo3HAKkiR7WpiseGJiseI0wHCJAh4iQFCGJACGNAhmRAzsqBWdkQFihqYiRDhXEWBYF36AZdf+4JWOi0wHL2IlAdHC97T+JrSWg1dE7Wk8kU6bHob3Nhyh9m0+JHiPIjjDywhxpxc0ebTsD+96Tn5DUS8xv2ZTBw8KM5QANXWTvbjYFX21+SqE13IlGXY0PAvsxAFzuAPZuv59FbzRXG5KxSfJsOG8q4aGiGWR1P9llLK5GscaRcve1gskNA67BZpNltpFFiOboGuLRbq6jQX21WscMmZSzJcELE85N/Bp3vVWsFckPM3wRpecvVV4SF4kih4zzc4kgHqhRSFbZkMZxVzjd/JXYqIMkriEnItRBMwjna2sWzWKEfGRp2Ul8AnPHRTW5SZKiic4AUmkK6JMPCzYzOpWoGbmHxLcPH1BK0UUiZNsiT8aFUxoVWkTTZWYnFyk+a9VOqynHSVrpDaVjoygasS7HtYmTYdkaYg7YUhhWwKkhh24ZCQBBhNEwGnCoECkgQIA6JIQMxpgIGIEOaxAGl5axMUDHSYgNdE45WxkZi94yl2hBGUNJGvWQdtOfO+y5NsSO4pzzKcngsbC2PMGsZRjbmdfkFWLG93fosIw7vc1brgjP54x00bI34ggRyCRhFNcHt+El25A00PYfPR7cEpGs4B9q+OhiySObO6206SyctEHUVZOhvpXqrTTJaZ6Vy39pUGIY1rhln0HhkhokP+2SdTf4Tqelqkk3yS20tkC4hz6dQwZaseui644Io5XmkzPcV5skkbWY17rRQiuCHJszf/AIgbOqAQTDvc+z0SsYyZ5PVZ6ykRX2Tf7/eiTZeye42YABTbNbTR0WNbWWrTskJh8NK4+VpA9UtLBSSDngThq91KlATmJ91gjG9lLShptgzxUNBDQmkJlbLjJHk0TuihgXYcnVzlMnTJfqJOHxcEbbOrgnqVCSkyr4rxzxDYFUsjZtvkqHYo2ixFbHGhoCTHCgCXFh0AS4sIgZOw+Avoqslui0w3BSa0TJ1lhHy46vhO6BWwMvLj/wCVMdlZxDgzmXYRQailmw1IodkY4clAxzMJ3SESYMICQALJ6BDdC9hG49i3PfkDriiAZGAfLTdC8VuXHW99QOi4m022dSjSoqpZWiqHT8v8qkmDpAI2Gs2mvpaogLEXXXrrSAJhxeXqqA20XEnYmBkrjcrAGynrIwaRzHu78Lj3DT1W2DL/ACMwzY/5kMYSV06jHSHwuHLyAOp3UthtwXcuWFob1pZSbJfkQGSg3QPsEkjWCpDsLwmaQ0G0O5V0yrLBnKv/AKj/AJbK9KI1DM+Gw5oCymkhNtkKbmBzjTG1/VFhpImKixEgzOJApOmzHLnjiVtWVMljQlZOkzpx5NcVJdyNLigFLkaKJHfxUjYKdTHRGmxb3blJjIrikAh1SQNiCN3ZVQh0UCQE6DCpAWuE4eT0QNIv8BwFzqoKXIdGn4bym7qFSkRKJseFcrNAGYaJuRMYF43g0VVl/dUp1s00Do+DxD8IPv8AlSNbBQRT80ctRSRlzW04dleObbpkTilujxri3A3tcfLS3ohMqTw1wU0O0DmwRASoCPxG8PG0atmfmJsEFkegGXXQk3r291y5p26XB044Lky2JxHbr+91nGJcpHcOwEkzwxgJJv6An9E5TURQg58E4YXKCHAgt0I7Vvf5JKVg4OPIj46GoJ+h9FVk0arkTBxSZmva/MXZnSRsbI5kTW1XmBDG5i4k9aaLpc+WbPQ6SEat8+stxw7Dh5lwcrZjE6pGMi8PxInW17cjaaTV6tABF6W0WoZHe5p1XSrR4kVXmv3JOP4PJG7K1pcDqxw1DmH4XWvUhNSVnhTWl0y+5f5dkAzvoE/mrMwuO4NFmzSOv5pVbFRGjxsDD5W2tdGwkRsTzC4OpgAS2NKIGJ4k86l2qq1RHcpMXOCbJWWo1SK+TiYZ8Kz1D0WJiOZpXNyjQJ+IyJYITVSVlTLiHHcrM2UVFUgWYoGcNUhjHO6ICzmuFJiGtnpAgp4geydhRfwcKd2UgjR8D5YklcAGE/JOgPReE8h5aL6H/Kzss1GB4BFH0sqHGyizZGBsAE0qEPTA5ADHyAblNJslySKziXFGBpC2x43dmU52efcexbCTsF0ozMbjcYwJMCFhuLBrry2K36t/1D291jlhqjSNcb0ytmS5kke2XznPYa4OOa6c0O/ENN/8rhjCtjrc9ikDC4gDUlaNpLchJydI9h+zbl5kbBI8W/vtViyP8rz8uTUz18WHRH1lr9ovK3itE0EbTJVODW+Y9nep1VRnTMMmPUYzDci4x7M/gGu16jT+XdaeKuxj4DXJrOSOSo6e3EZ43Uf4ZaPOK7PBa4AkHKR0HRZSnb5NoXCOyLTBYfh3D3M8JznTB8ZdqKsuyhrgNGHzOpu/n9ER8zsbySjJOlGn9/fkbtzIpmWyhdna8p71/ULqhPS7R4+TC/yswnMmNxMD8jhTT8L2/A72Pf0Oq9CGSE1cTzcmOcXUjOyEvd536ddVq5IhINisThYWbhzvzQ5qjLLHI60GVxnGQTbQsdR3cpWVeI4i93VK2CSI8kzipZVACUgGoAmwYMEWSqSE2RZhRpSxoASQUANKQxSNEwBZUxHEFSB9d4XlzCx/DC03uXDN/VZSSlyaLbgntEcYoZGDsKaqSYm0hH4xg3cPzRpYnJAzxGP+ZDTQ1JMFLxeMdUlYNjGcXaRatQM3NkfE8eY0bhaRxoh5GZjivNI11WijRNmP4pzM910qsKM5jMc9+5SsqivERcdT+aTlREmkgRYA4jeuyV2iottWPEMb3Pc+Npd4YAJtxGQNbbQTV0P1XNmhpjqR0YpXKiFhOHsEbJALeXOzHoGnQNArSqH/ANlyZb0Hb09KdHrXKEDixvTS/e9f1XC3Z6zaSNNjOPYXCMzYiVoPRorMfkFrjrvucWSE5PbZCcv80w4thkiBygkAkb0qbpieD1ma514qQ9rmnUXQHcf8lQ93Z0RioRpFS6TC4oxzSsqaNzTmBc3NkNtzAfENNLVKbWwmrNXhsdkdbDYvXrv1H5q4yJnBSW5cyyslblcGuDx543ag+vofVPW4u4mDwprTJHiXOWKgixcsUAc5jPK65CQ2T8QiI18uxzZtbHRe90eB5MWrL34o8bqNMMmmBmY8XnvTS9Df7v6J4+n8Runsu5EsmjkVx9D+drV9FtsyVn80NyE/D5q3q7HuNwPXZcc8Uoco1jJPgYXLMsG5IZwCEJoX7wR1QNcAZHEpAdqUANKAEz6poGznvATZKYLx0qGfQOL52kds8j0BpW8UWZLIymn4867zFaxikiWxW8wO7pNFWHPHnaaqHEaYGbjhI3U0VYw8bfVAqkS0Q5+IvI1JVpi0ldNLepKLDSQ3EFTY6IkkiTHRFfIkFWMLkwGeKb039EnuNBmSkU1oA7AixqSSNtjf7s1h4em090beJbtbMvzzNNEwMi1pocOtW260G4v6FebLC4yfke1i6qEorz8jE4jEz4iUlxdI8nar/wCB9FtFRirM5a5No9O4BxM4fCiOgwjV15dXEa0BpXRc0nqkdcIJIp+L450jcziNTof6KnsZyZST4stI6D371Y/fZJRtGUpUy84PzKHMaHOstJae+xIVqDQ45EzScX5oGFwrpgR4hGWId3nbTqB8R9vVdHT4fFyKPbuZdRk0Qs8aJc41dudqSTZ11Lie697qMuiFI8bp8LzZVFd39/DkmBgaAB7C/qSurAtOKNrc5upUfGkoO0nyNjkvUbdO59fQK4z1K1wYyjW3cC2YseCCQsm6lZsopxLt2H8cWxo8Ubi2tEjep1oZhv6i9zvz9V01+njXuFhy16MmUL3Uet9fdecdYhJKAOtIYhpCBivnA2ToWoA+ZIdgHSJioY6RKxpGh4VwCKWJsjpw0uu2+XSnEdT6LSMU1dmM8rjKqLqLFG1qhaSYZSVQUEjBKllJB9dipYxXaKGNDXTgIGRpMcAqQmR3YjMhiEwuGfK4hguqs60LNC/UnQAWT0BWWXLHHHVN0jowYJ556Mat/L1t9l6zURcrwQsDsbMIr1yk26hv/DYc31+S8LL+MZJusEfeexh/CoPhPJXNejH/ANuX+hfYfh2Cw0IkliiLMS8Nw8mKw0ZyeVxzObQIYRVZiDpfvS6rrcWLXONu/Pt99g/hcHUZNOKKWlbqLe/sbvf7QVvAsMGnPhoJmPaLfDGxj231YxrRlaLGoJPqd0+m6zNljrlxfHdFvo+ne0Y6X5PdfG+fcvcWMvKuDmYKiZQAAdGMjwANLqrPuuqGefKZy5MEPyyj9+0875u5LlgBlieJYhegBEjR6iqNfL2XVDqVLZnFk6OUU5LdfqYyLEOaQ4GiNiuh7qjkPSuTooZsO6W4onNBEjiBoWi3OPfSiB6ryMuPRNx7dj6DBn141Kt+H7TEcw8Rw+IkvCeJG1gAL3kkzus+fL+D076aBaOKit0R498Mhu43lYY3EOI30N36HUKfDbYnnVFPNxKwR06X+q2jipnLPNaI/Dsd4cmY7du/7payhfBjjy6XbLHifEpMXI0nRkYpgOzR1cfU19B2Xbhrp41zJ/fwL8OfVSfaK5fZL6i4SADXvevU0unMlWhc2l739F+wdBBwl40vy1J/+K+rpeumgOJNmu5r5bu/suyTTSS4fyPJkpKcnPlN37bCrUwIU51XPPk6YcFhw7EVRvbsrhLYwyR3GcTcM5edyfMPWviHvR/I9153VQrJa7nVivw79xBdP2XOVYF0iVoZL4dh2vNvJy9T0HuVDk7ovQtLfc7i0cQIEZHrRtVJ1wZ4k2vSKsuQaUJSBnZUgOyooDeQRgLoMXsTGvFKg7Dmy0FLAe7EaaqQIz8ShlIDv1SAjzPpMCVwLhcmKmZBH8Tzq4/Cxo1c93oACfp1SbrcErex6nhOGYXBhojxvhxTZWxyvja5niBpDnh9hpLtTnIoDQGqC+e6nwur6nw3N7Ly29l/29572CGSGFwWK3Hd77u/Nc7eW3sLfAfZvhRL40z5cS/M11yuGUkaglrQLG2hsUAF6GPpceOqXBnl/GOoni8JUo8bIuOb+WI8fE2KR72ZH52uZV3lc2jYOnm+i1yY1NUzl6PrJ9LPXBJ7VuYD/oubBPJjxzDQ0FOa9oJJAdGCQ5p16t1Gh3XBlwTxb42vY9r957T/ABNdYqyQ3XdBmcywsqPEN8CYi2lrra8HqHsP/a6jrqERdqzPS7fyf7WXmAlDxpRsWR3v9f6rQxl5nm32icoNhLsTDQYTb49st/iZ6dx0+i6sOa/Rkef1HS0nkj70YiDFua1zA4hrviAJAPvS3nCMmm+xy48s4JqL5OjkbmDsova+lVVVtt6dAh44vkSyyXAHGcJFExO00OQ/FXXKb839fqs5wcd+TaGZSSitiknZRod9U0TJb7CQw2R10tdHTpOW5nJOtvKy+w8FNA77/v2Tk7zSyLiPz7fqe7gwqHSwwvnI/fXL+Ef1Dn/8j9/mrhcYwb5eqX6bBlqc8qiqUXjgv/ZX86Kx7rlPYfsrq6WfiKL8lR4X4lBQzZK7yb+JJga6R7Y2C3O+EbdLLndgACfkujNm0Rs4IYrZoMbySGNAfK4ymj5Q1zdyMuUexHxX/Red/ESbtnYsaSpGYlYWF7DoQ07bWDoR3FartU042vI53Hde0lOxt4eRjgCHBjwerXtrUH1BI+R7lZ9RBShq7ovDLS3B8P7X36ylwzxmGbbqvMyanF6eTeKV7hsZIzN5RpWtbLPCppekXk0/yjocbTC2u/17ros53HchtapNBXBADihsEgaAOpAGyil6LazMJnITsAgeVIHEdzogLGTSNGyAACbskME+QlKx0bXkrAj7rLIdHTP8G/8AaYGOeNNac+SOx/tjpa838SySUYwi+We1+C40szytflW3t+0zf884aOLCRvkj8QR5ajAsWWlgoe5A+YXn4sCwyVu20dX4dnbzTp1du/1L2LHxcPwkLcQ9jHBgGRtNGbdzWAmg0E1qe2tlevaxxVnluGTqs0njTdv7sNzFjWnAzTNJcxsbpDlc5jixnme0OaQ5pLQ4dwql+UxxRaypPz9p4twDgplMk8b/AASdYycxDiHW5zwTbm6OGvU9wV891fX+DkSW/n9Pb3PsM8YRgopffb6+z2jcVzFhpLw/EMO0zCwJRpYJ0cx4ohq9HE9cdcfv2nlZVLHLRK13r90bPlhsTYQGSOdlApxIsgeo0+WiZMvSpldx+Z0gO5aLBafhd+E38imhNJ7Hl3HuHeBIALLHAOYTe2xafUEEe1HqvQxT1xs8PPi8KekrqctTKmDxc9Ny35jQ9gev0VTWmGoeOOqSRAIofv5LGKbaX36zslUY2vvyLDBYYNBPqB/ddGF1pn3qT+HBp/DpRnB8OUI/HdllEbd32AA1JJ7DqdUSah0a/qe79n2j0Mb1/ic5v8uOO3vS+rOlY5vxsc0nzAOaWki9wD0sEfJR1PUY5TXhSTSVbO+3q9TF+FKUsGSWRU3PV8KfzRU4Vlgnq4k6/S/Reh0eLTiXrPmury68rbNPyK1oxQJs1kdfU5Z4j+lV2JS6tVBe0nC7Z6LjoTna+wWxPbCGAX5MwYHOcTWuY7DqdRYXAdL4PJ+bj/5l+oJyU4/zOGYOd62QSuzE/QZlLkpsPISHN7sI/LzfpSMuRKDLjjblt6/kRqXCApToDmhJuh0cUWM6krAaUAcnYluIlY6NQJxa1Mwn3i9EwEM52KQUFMnl7osGhhYSLSACZwNErGhhemB6T9mTx4Ie6skTn2CPhdNnDZHHo0mFrdtCAeunldZ6M/EfC/dL91+p7vRO+m8OPMv10u2vgzU4HijpxI1/njwkjLxBFRuka8ERt1t3my67ZdTVheXKGX/k9oq68/JfE6suKEJpY9pTT9HyTXL9dduzKbmflGTEy+M7EOc5w1JALR6M1FDtvvuuD/WJt/7qOzouqxYIOEYV8/fs/wBgHDMDiOHMkPjeJh3sLZoJfI3KW0SzV2V4bpexqj0rs6b8ZUpaNPPluc/U4cPUtyjtJcVuvfwB49x44Ufciwska0AE1lc07PY4aFh1GbpVUKIXP/pU45XPJ5nX0fg534qdv/6+XtMXxbDsk+IOL3lgyjzyBzmjK1gAsucdh0sDUgr0enc00of53OjrPDeFxy+t39/bJfLvHJIC7BOIL4rZro29nUT1abb2NL0MkN7PmsOZ1T/yvM12DiDjR2r8XTfbvuoOhsyfPGPgFQAZ3tIJddeEfxNHcmhp7XrS9LoOjlNObdL5nmdfnhtGrZjJJqOhB/MfI+vta3yYHDk89Tsgy/GT7n9Asss9apcXXwO7Fj8OSvmr97DYeOz8wPongT5/pbN5xTaX9cUT39tvMP6BbYqVL+h/MvqW3qr/ALy+WxveXpRHBG8sha0xyOdTXvmkdHMBZrRjsuvW2tPcL5rq3GUHFtOWyVvdbrb+lfM7JqMcsm0+fdx+v7FN9oDP4jXhzXB0ZbTXBxaWHUGttHN+qX4Zk1Y3Fpre91zf+GdEJVGa++Cy5P8AssmxOGZiJcQzDRyNDmAs8V7mHZxGZoaCNRqdDsF7vUfjWLB6Ca+/UfKR6Vzdlw37Kjh5GyQ8Shc8ahkrDEHD1eHuI9w3TQ9Fyf63inGpfHf6Gv8ADSj2O5mdNho807SxtgtfF4kkRsUHZmAta7Xy5iCb+S6cGaGf/puxS22Z5NxLEeI4vHw04NHUAd67kk/Neko6cdGN3IhYM+cdgQT+v9lytxnLS+DpxuUXrirrcaszIXdJgkcAkUhwCkBCqCxPDJ6FMls4tpA0zhSKC2XLbOqsgPG4fNACuclZQjJ6TTJYdmM0qtENhRDe0E2psdDCUWM9H+xjFsdPJhZADHPE9paSfNlOcewAMuv+odly5F/ub8NfI9DHOumUoupRla96X0/Q3v2h8PZh+FCCFuSJr4gaDnZRmzZn1rq8Ns6m3LDqtsVRR1/hebV1qy5Xb3POpOMTtZbZPEIcRYcaAobbHMPRvVeCsMHLdV9+/wCZ9YsMG9kl7UvuvayHisRJLh5/vE2U5AYmuz27zeb4fShbtNfmNIKMMsFjjavf1fH9jPPUFWNKnadfX6Ho8/DouJcMwjpTllEMZjmDQXRyBga40fiaS3VpOtDYgEfQSgpxpnxEc8+nzNwfcz+Lw8HCsJLiGky4pzS1s8gGbO8V/CbZyDck2XGjZ6Ajjjjj6I8nUZOpyJSZ47jpfgeKEjR5i3vsNP5tLPqVnjXKfHY68y2TXKL2DnWRsRa4AyAAM7a9T/Va4sGqaXY559Q4r1mbfITuSSbLnHUkn4nE97Xv26UYnkvlyYhOoay9tumutuPVEnuoQX094Lhyl9+wfJFVE69+mxtTPo4aaXr/AFNMfVycre/H6bk5gYA2nW46kVVUdAP5tNSfWulnGONwUlLhQpevmzrWaOScHHvkTryW1A5X63/qC569C/8A82ds53kbXfMv0LHDyPeTmzSxCJwEYkDWscBu5pcKFAuzevpp48oxx1JVGTad1yr7On7K9XrKztyzSXK32viyBI5rYxE0h1ZiXDYvcADV/hAa0e4J7LryYp/nmq22XklLa/W9T/TuPpcsdMlHl7e+n9D2nD4JkbI2SNwoyRsaw46ch2VrQB4eHGkTKAoHzbZtbXyHiOcnJXu+y/fv8vLY9nC3CGjE50v+3H5y5k/08tiFxviuHYJIPLG97GNzYbN4BY55BGhOaxY1FD1Xs9HhyvHrjuna3dPZW9v7nB/Fzx53kmnJQp+nytTpetO127Bn8VaWPMBc4tyhrSGNa5zqyscxtRhxNagA32K4s8HHLrfop73w689t/wBmZOOHJFpqn5b1fbm/qea/aBhIwG4mFuTxHFk8RFGKcau06Bws13aT1oe1+G/iGSWN4cm8lun2lHz+p5vWdH4M7XBksMza+pGnz3P1XdGaUql2EsEpY/RfI0BUciQ4BIY9saB2hXRoJJ/AvDMn8TZUhO2WXMeLgrLEPmiTQRXmZkutRZpSOLErAtIcVpVLazIeHoGd41JDFifqgQ98tqRgiUwGiVvVFCst+UeaPuWKbO1geMrmFpdl0cRZBo0RQ6KMkbiVCW9Xsz2mX7ScMML94Ikc28jmAML2urVsgc4Nr56hw7rkUzZ42p6O55LzHzJgps7sNhHYdw2AkaYzf/ty0tb/APBzd+qieOEnxz5HqYOo6jEq1fN/QLwPj3CWD+NBNI/e5i18V+kUWUEejw5aQxwTtI5s+bqcn5pG0/6yifHcTgW7UBlDaFAZa8oAqgFsmjz3Fp7mP5q5ignYYpHggGwA4W1wsWK6izp7hOrKi3HdGAsAElwIGgrd3bTop0qzo8d1uRWSa27rfy7Eey1g6ZzNtj3NI66d+lLoWWa2v3kbBoZALN/ul3Y5RSbvkynFukSIpb16dFvGd7mUoVsI2s19qr6qXCEpO1ZcZyglKLp3YTTT87Uy6fHL4V7jWPVZFu9/S1e8Sxq76LGfRQliULextDr5xzSyaVb/ALfQXDvEcjXgmw4OF1VtN0qz9LDLBwbe6q/h9DLF1MoS1Jd7r4/U1uH+0mZh0w+Fo3mIiLnuPUue9znOPqSvEn/8b6Zrac/iq+CS/Q9GH4tmb/3N15KTjXsrZfAtcLx5uP1+6N8VlvzYRzY5Rl1zGF5/iDb4Td1Y2B8zP0uToG2p3B7ekrW+1X/K/b8TpjnxdQq1Sva1Lfj13dL7QDE8OjL3SiaWQNLjiWZHQTxA2wPLK8waQbq/hWM+um4LFoStJRd6out6vs3+5viwcRbWzcva+PgqpeZlec+JF7mxOcHubXiPG0mTMIZD6lj9fku78K6eKeqqT4XlfK9lo5PxDLdQ95SxPrL++i9OUNWtrzRnDJpUF6n8hhpB51Md4iAoeLdsp3KoZI1MOBrWFDBBA3RTYziwDVK9wOMg7JUMlRNA1W5kPLm90ACM7UBZ33sdECsE/FFAWGppbZOvupTLnFJbEEvVGdCZkDonYPiBa1zCfK4UexA2ze3Q9PULnyYt9UTeOVNJS7cP77EZ4cB1r0Nj+yzpWdKyWqBuea/wOnrSdKytTolQ8QeyPwxYcSbJ3AP6qtjlUXJgPu1Nt29aDqfkiNydIbyKPBCebWmmiG7djUhB4XaV2WqacSWg8eGzAkECunf+y6unxydtf5M5ZFHZjJHkeUiq7rZ5knpezHGKe6HRya/vorjNaiZR2CF30/otbISELv8AKLHQ0n6JclIYXKb2KoaHkEOBoggg+o1CwypTi19tespI3fDOZGztdK85cRCLDrJ8SJjSXROzG3Cg4aknUa718r1nQLG14X5JOmvKT4fx93J6HQ9U4SeOfdc+wwc82d7nd9gdaA0aPkAB8l7fTRUF9+9nLkm5ycn3JeDb5wN7Dhr6tI/VKGT/AG5Xy2diwKeSMV5MYGKU7OGqEDbTEHgaeiFuJuhCzVNuhcjZz8lKKEzWFPcYXwtLJTYASwJDoDnNLbUroy07WML0WFCZk7Ch0b6QJo4uQFHUgDqQAoQDFCBBmOLdjSiST5FYrMQRrTb75R+ih4Yv/JpqfdiOmJJOxPYAfVUsUV2FrdUBcVfAgMrOqUt+SkwSzKHRvINhVF0wLHDYjShV+u3yH+V6nTzSjpic2THvZb8G4WMW7wnSRxkg059gWBoBWxOgXP1k05RT8md3SQiumySa/mj/AHEx3JWJigM7smVoa5zc1Oa1xyjegXZtMoN3tfTmhm0vfgzcbdRKCcOY4se0tc0kOa4FrmkaEOB1BC6/4lIz0oRsi2jnjIlwHWtRDSlQ0MK5cjSZohrJCLrqKPsVwz9J2MWAappehJmmJJzSZPwj/MT2oJY4ej7mzthl05VJecV+o6UenVI4ZqpNBMHhC6yjkkQtLTSpbEMOIgKPVRyyktiLiTmOyHIaR0cOlpAcDYoqZt2qKSVA/DVWSQWlaUIVUSKEAOKYjggBQUhDy+0ANCAFCAFtACgJAxciYhRH3SB2OLRSTKRCljo+nRSywaQDgVrGdIDQ8oStEoc8FzGtmc9o3LWwPcQPkCoyTc8sTsx/8Wa9f0N7hMRHNG/CNbJizL42Y4aMyGNzpp5oZSTTW05zLBcNCVDVp2c+O1JPgNz9DnizT4PCYJ5lGIlOIxLZJZn+HkkZHHDcgY7y/CW6i6B1VOrW9oUKSltZ5LjmxWTG4nU0MpDQOzS5xca0GqV09ia2sih62jnlEmh2da/xDaChpcsZTsY1ZAHjC3yRqGnzNMP5r8gsB+pUvmVdo0bYuI33lfwLR7TlsrJcIzy/9SXtfzOwtgb0mjJvY5zK13VSJgmDBdvVrPdl8cihh3IScWxxdCuYfknHG+4pSVkzh3DmvdqdlegWrcbNCwOIvZNQQrM2ECFCYCtFpiFQIeEhC5Uwsc2NILFa1BQ9zAgTJPDhHfnTQqA4pgzHLskx1YyPRAUK4WUiqODeiBew6WCxR+SRRXvYQaKkBqAJOEkIDgDVjppuKI+d0iMbyROnFJLHOL8i9wXOGLhwowkMhijzOc8x+WR+ajReNQPQV62qkqUvaRFLUvvsZ9zyS4kkk2STqT7qZNurJX8wJBHY5ACIEcgBzWrSEG9wCt2JRJtzSNYbQbCD8KadxyM14eNF0wktaPQLOCbijPqGtcizODGQaaqvAyN+icnj41yxWYdsLc0my3l07X5gx9SpbRFwnFoL1bp7LWE8a2M9E3K2VHFeKxknIFhKSTOp00VT+IGlDmuxNA2Y542O6hzYUAdKSbJKVsY5rCdgqoVi5CnQrHMQFhMgTJ3CQloIvUJWNos+I4uIsAYNVTJSKzOoY9zo9UFjnMQIVmH0RYJCBiB0PyqRhm0AmkJsHWqGCJYwxy5ikUiJioA4evRNoRVyxlpoqQEYVeN1JML2JB6eyiTvU/WddL0PYDaN05KmkZR4kxuXRJr0qIr0LHMiJIFboUW7rsWoO4rzFxENOIVRjcFJBnxeHlcBDDW6rDpk9xZMTgk2Gwr6JXoYpW2zkyRtF1h4oHtILtenT5LLqFGGWOTtwz0Ogj43T5MHElvH6ffmI7AxlocDsdrBSjiUcksT/m3RWSSn0uPqYLeDqS+G/wB+fqIj+IhhodNPy0XLF6VTOfqaeWWniwjuZX1QC6I9W4qkjz5dHGUrZXY7ickvxHTsscmeU+TfFhjjVIiukJWJqMQByAFpAC5SgCbw/G+Hdi1opEuNgp5cxLu6TYJDAEWNj8uiLJHxxJDuwzWhA9mO8FJsEgsMQG6Ywcm6AWwsbik2AWkx0dHFZQhCuASbFQyNyGh2SJHOI30SsYNsSLAfLgWkeb5JsuEdXI2Ph7ANBqepTSM2VcrKdl7WP0Sj+SR0t3OK9QbDx20/velqvTzwXq+ppBV0uSfr+dfUkfdAGi9VthgpdVLyX9hdTBQ6CE+7f1ZJlppHoCssf/HyyXd/fzO7qtMOrwQfZN/p/Yp53WbU9LdaUeb1UtU9QbFxUwHq5YY1KORx9x2dXjUcEZd3TIzTS9KLo8lqyxwLmZgQD6tPr2K0y4llx6VyX0nU/wAPnU57x4fsLSGMNzO2aAS4bggdKXO3rxxyLmHJ6fhrpuonhn+TInXq52/v7PWZaV9knuSfzK5ZO5NnlLjcaApGLkKAoeYSm1QLcNHhLChyNFEcYelJWFDSyigZMEre30V7E0z/2Q=="))
        surati.add(Barcelona_images("https://images.daznservices.com/di/library/GOAL/1b/c5/ronaldinho-barcelona_1slsxexo4gn5z1m0cln77mlj3h.jpg?t=100890353&quality=60&w=1200&h=800"))
        surati.add(Barcelona_images("https://i1.wp.com/thesefootballtimes.co/wp-content/uploads/2015/10/379100_andres_iniesta.jpg?fit=2048%2C1486&ssl=1"))
        surati.add(Barcelona_images("https://i2.wp.com/thesefootballtimes.co/wp-content/uploads/2017/07/xavi.jpg?fit=1600%2C1065&ssl=1"))
        surati.add(Barcelona_images("https://barcauniversal.com/wp-content/uploads/2020/04/Carles-Puyol-1000x600.jpg"))
        surati.add(Barcelona_images("http://i.cdn.turner.com/cnn/2011/SPORT/football/03/22/football.alves.barcelona.contract/t1larg.alves.jpg"))
        surati.add(Barcelona_images("https://images2.minutemediacdn.com/image/upload/c_fill,w_912,h_516,f_auto,q_auto,g_auto/shape/cover/sport/5863d0b36ef3a6a67f000001.jpg"))
        surati.add(Barcelona_images("https://cdn.vox-cdn.com/thumbor/Wrxl6EkAcYdVOyCpr2zfeSGHqcs=/0x0:3000x2000/1200x800/filters:focal(0x0:3000x2000)/cdn.vox-cdn.com/uploads/chorus_image/image/45170432/108540101.0.jpg"))
        surati.add(Barcelona_images("https://images.daznservices.com/di/library/GOAL/e8/f7/gerard-pique-barcelona-2019-20_jgmr8tcafdqu1rd1te28osprr.jpg?t=-1360154547&quality=60&w=1200&h=800"))
        surati.add(Barcelona_images("https://barcauniversal.com/wp-content/uploads/2020/06/46632364-scaled.jpg"))
        surati.add(Barcelona_images("https://pbs.twimg.com/media/CeWGNfPWwAAVvpl.jpg"))

        val adapter = BarcelonaAdapter(surati)

        recyclerView.layoutManager = GridLayoutManager(this, 1)
        recyclerView.adapter = adapter

    }
}