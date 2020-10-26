# Notes

I can see why this is a kata. Still got stuck on the BOGOF implementation. I wasn't going to overrun the hour a second time, though.

I haven't established a way to allow the discount to be calculated without coupling Product, Discount and Item too tightly together. I don't really want to expose all the Item fields via Getters, nor have to check the Discount type to work out what needs passing in.

If I had to pick one of those, though, I'd probably go the Getter route. Pass the Item into the calculation method, have it extract what it needs. Avoids having horrible interfaces to get Discount what it needs, which won't be very extendable. 